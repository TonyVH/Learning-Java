public class test {
    private String girlName;

    public test(String name) {
        girlName = name;
    }

    public void setName(String name) {
        girlName = name;
    }
    public String getName() {
        return girlName;
    }
    public void saying() {
        System.out.printf("Your first girlfriend's name was %s\n", getName());
    }
}
