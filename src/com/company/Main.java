package com.company;

public class Main {
    char[] alphabet = " ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ".toCharArray();

    public static void main(String[] args) {
	char char1= ' ';
    int int1;
    int1 = char1;
        //System.out.println(int1);

       Main obj = new Main();
        System.out.println(obj.letterToNumber(char1));
        System.out.println(obj.letterToNumber2(char1));
        int a = 65;
        char c = (char)a;
        System.out.println(a);
        System.out.println(obj.numberToLetter(3));


    }

    public int letterToNumber(char letter) {

        letter = Character.toUpperCase(letter);
        int number=-1;
        for (int i = 0; i < alphabet.length; i++) {
        if(alphabet[i]==letter){
            return i;
        }
        }

        return number;
    }
    public int letterToNumber2(char letter){
        //working but wonky IMO
        //space= 32 Æ=198 Ø=216 Å=197
        //ASCII values used in upper case A=65, for enigma A=1
     letter = Character.toUpperCase(letter);
        int number;
        if(letter=='Æ'){
            number =letter-171;
        }else if (letter=='Ø'){
            number=letter-188;
        } else if (letter=='Å'){
            number=letter-168;
        } else if (letter==' '){
            number= letter-32;
        } else
        number = letter-64;


        return number;
    }
    public char numberToLetter(int number){
        char letter = alphabet[number];
        return letter;
    }
}
