class Strings {
    public static void main(String args[]) {
        String name1 = "Sam Miller";
        String name2 = new String("Mike Ross");
        System.out.println("Hello " + name2);
        System.out.println(name2.hashCode());
        System.out.println(name2.charAt(1));
        System.out.println(name2.concat(" Williams"));
        System.out.println(name1);

        String firstName = "Rex";
        String lastName = "Cook";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String str1 = "Sam";    // String Constant Pool - mutable and immutable strings
        String str2 = "Sam";
        System.out.println(str1 == str2);
        System.out.println(str1.hashCode() + " " + str2.hashCode());

        StringBuffer str3 = new StringBuffer("Sam");    // Thread safe
        str3.append(" Miller");
        System.out.println(str3.capacity());
        System.out.println(str3.length());
        str3.deleteCharAt(1);
        str3.insert(0, "Java ");
        str3.setLength(10);
        str3.ensureCapacity(25);
        System.out.println(str3.length());
        System.out.println(str3.capacity());
        System.out.println(str3.length());

        String str4 = str3.toString();
        System.out.println(str4);
    }
}