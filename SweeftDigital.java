package ge.edu.kiu;

public class SweeftDigital {

    public Boolean isPalindrome(String text){
        for(int i = 0; i < text.length()/2; i++)
            if(text.charAt(i) != text.charAt(text.length() - 1 - i)) return false;
        return true;
    }

    public int minSplit(int amount) {
        int res = 0;
        res += amount/50;
        amount = amount%50;
        res += amount/20;
        amount = amount%20;
        res += amount/10;
        amount = amount%10;
        res += amount/5;
        amount = amount%5;
        res += amount;

        return res;
    }

    public int notContains(int[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++) if(max < array[i]) max = array[i];

        int[] present = new int[max + 1];
        for(int i = 0; i < array.length; i++) if(array[i] > 0) present[array[i]] = 1;

        for(int i = 1; i <= max; i++) if(present[i] != 1) return i;
        return max + 1;
    }

    public Boolean isProperly(String sequence){
        int counter = 0;
        for(int i = 0; i < sequence.length(); i++){
            if(sequence.charAt(i) == '(') counter++;
            else counter--;

            if(counter < 0) return false;
        }


        return (counter == 0);
    }

    public int countVariants(int stearsCount){
        if(stearsCount <= 2) return stearsCount;

        return countVariants(stearsCount - 1) + countVariants(stearsCount - 2);
    }

}
