package Chapter18Practice;

public class TowersOfHanoi {
    public static void main(String[] args) {
        int startPeg = 1; // value 1 used to indicate startPeg on output
        int endPeg = 3; // value 3 used to indicate endPeg on output
        int tempPeg = 2; // value 2 used to indicate tempPeg on output
        int totalDisks = 3; // number of disks

        // initial non-recursive call: move all disks
        //call method with 4 arguments
        solveTowers(totalDisks, startPeg, endPeg, tempPeg);
    }

    public static void solveTowers(int disks, int sourcePeg, int destinationPeg, int tempPeg) {
        // bae case -- only one disk to move
        if (disks == 1) {
            System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);
            return;
        }

        // recursion step -- move (disk - 1) disks from sourcePeg to tempPeg using destinationPeg
        solveTowers(disks - 1, sourcePeg, tempPeg, destinationPeg);

        //move last disk from sourcePeg to destinationPeg
        System.out.printf("%n%d --> %d", sourcePeg, destinationPeg);

        // move (disks -1) disks from tempPeg to destinationPeg
        solveTowers(disks - 1, tempPeg, destinationPeg, sourcePeg);
    }
}
