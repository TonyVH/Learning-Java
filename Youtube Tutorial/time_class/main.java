class main {
    public static void main(String[] args) {
        clock clockObject = new clock();
        System.out.println(clockObject.toMilitary());
        clockObject.setTime(13, 27, 50);
        System.out.println(clockObject.toMilitary());

        clockObject.setTime(14, 34, 52);
        System.out.println(clockObject.toNormal());
    }
}
