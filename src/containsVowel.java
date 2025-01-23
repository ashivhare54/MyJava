 class containsVowel {
    public static  void main(String []args){
//        String s ="abc";
//        String a= new String("def");

        String str="Hello";
        if(containVowel(str)){
            System.out.println("yes vowel is present");
        }
        else{
            System.out.println("Not present");
        }

    }

    public static boolean containVowel(String str){
        str =str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                return true;
            }
        }
        return false;
    }

}

