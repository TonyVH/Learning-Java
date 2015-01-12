// An interface that contains constants.
interface IConst {
    int MIN = 0;
    int MAX = 10;
    String ERROR_MSG = "Boundary Error";
}

class IConstDemo implements IConst {
    public static void main(String args[]) {
        int nums[] = new int[MAX];

        for(int i = MIN; i < 11; i++) {
            if(i >= MAX) {
                System.out.println(ERROR_MSG);
            }
            else {
                nums[i] = i;
                System.out.print(nums[i] + " ");
            }
        }
    }
}
