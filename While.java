package org.example;

public class While {
        public static void main(String[] args) {
            String word = "sdshbdsbddsszhbuhhhiuh";
            int positionOfTheSymbol = 2;

            while (positionOfTheSymbol < word.length()) {
                char currentChar = word.charAt(positionOfTheSymbol);
                System.out.println(currentChar);
                if (currentChar == 'z') {
                    break;
                }

                positionOfTheSymbol = positionOfTheSymbol + 3;
            }
        }
    }


