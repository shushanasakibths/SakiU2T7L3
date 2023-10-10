public class CustomStringMethodsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        String str = "";

        boolean bool = methods.longerThan("Starfire", 7);
        System.out.println(bool);

        str = methods.funnyString("Robin", 2);
        System.out.println(str);

        str = methods.halvesReversed("Nightwing");
        System.out.println(str);

        str = methods.pigLatin("pig") + " " + methods.pigLatin("pig") + " " + methods.pigLatin("latin") + "!";
        System.out.println(str);

        str = methods.removeCharacter("Teen Titans Go!", 3);
        System.out.println(str);

        str = methods.insertAt("Nightwing", "Grayson", "tw");
        System.out.println(str);

        str = methods.endUp("slade", 2);
        System.out.println(str);

        str = methods.yellOrWhisper("Teen titans...GO!");
        System.out.println(str);

        str = methods.starBetween("Starfire!");
        System.out.println(str);
    }
}


