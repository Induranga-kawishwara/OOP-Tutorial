public class Question_02 {
    public static void main(String[] args)
    {
        String animal1 = "quick brown fox";
        String animal2 = "lazy dog";
        String article = "the";
        String action = "jumps over";

        String all = article.concat(" ").concat(animal1).concat(" ").concat(action).concat(" ").concat(animal2);
        System.out.println(all);
        System.out.println(all.length()+" is the length of string.\n\n");

        //3. Do the same as in 2 above, but instead of using the concat method, use the + operator.//

        System.out.println(article+" "+animal1+" "+action+" "+animal2);
    }

}
