public class CustomArray {
    private int[] data;

    public CustomArray(int[] data) {
        this.data = data;
    }

    public int getElement(int i) {
        return this.data[i];
    }

    public int length() {
        return this.data.length;
    }

    public void setElement(int i, int value) {
        this.data[i] = value;
    }

    public void reverse() {
   	// [1 2 3 4 5] -> [5 4 3 2 1]
        // divide array by 2 because if we will leave it like data.length - 1,
        // elements will be swapped each 2 times, so it will come back to the same condition
        // dividing by 2, let us make list length 2 and it swaps 1 and 5, 2 and 4 just 1 time
        // 3 stays on the same index
        for (int i = 0; i < data.length / 2; i++) {
            swap(i , length() - 1 - i);
        }
    }

    private void swap(int first, int second) {
        // if we would not write this line, the last element (second) would swapped into first
        // and when we would swap getElement(first) with second, then we got the result that 5 swap 5 which is not correct
        // so int temp = getElement(first); runs before the setElement(first, getElement(second));.
        // By this way we are assigning first element to the variable which we will use and it will not be changed,
        // so we don't have to worry about lost element
        int temp = getElement(first);
        setElement(first, getElement(second));
        //setElement(second, getElement(first));
        setElement(second, temp);
    }

    public boolean contains(int number) {
        for (int d : data) {
            // check if the number at the position is equals to the number in the parameter
            if (d == number)
                return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof CustomArray))
            return false;

        CustomArray other = (CustomArray) obj;
        if (other.length() != this.length())
            return false;
        for (int i = 0; i < this.length(); i++)
            if (this.getElement(i) != other.getElement(i))
                return false;

        return true;
    }

    @Override
    public String toString() {
        String sb = "";
        for (int i : data)
            sb += i + ", ";

        return sb.substring(0, sb.length() - 2);
    }
}
