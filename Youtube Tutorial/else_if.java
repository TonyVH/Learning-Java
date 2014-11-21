class else_if {
    public static void main(String args[]) {
        int age = 55;

        if (age >= 40 && age < 50)
            System.out.println("You are in your 40's");
        else if (age >= 50 && age < 60)
            System.out.println("You are in your 50's");
        else if (age >= 60)
            System.out.println("You are a senior citizen");
        else
            System.out.println("You are a young buck");
    }
}
