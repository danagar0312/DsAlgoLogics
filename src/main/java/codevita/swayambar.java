package codevita;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class swayambar {

    /**

     1. Bride will choose
     2. Array(bride), Array (groom)
     3. Most eligible1 (G1) > most eligible2 (G2) > most eligible3 (G3) > etc...
     4. Groom[] = [G1,G2,G3,G4,...]
     5. If G1 swap with GN, stop swayambar
     6. If same drink, then form pair, next bride will choose from the remaining

     Inputs:
     1. No of grooms = No of Bride = 4
     2. Bride[] = [B1-r, B2-r, B3-m, B4-m]
     3. Groom[] = [G1-r, G2-r, G3-r, G4-m]

     ************************************************
     [B1-r,B2-r,B3-m,B4-m] [G1-r,G2-r,G3-m,G4-r]
     ************************************************
     Outputs:
     Remaining left
    **/


    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = null;
        String noOfGrooms = "";
        int noOfBrides;
        while ((line = br.readLine()) != null) {


            String[] tokens = line.split("\\s+");
            noOfGrooms = tokens[0];
            noOfBrides = Integer.parseInt(tokens[0]);


            System.out.println("noOfGrooms " + noOfGrooms + " " + "noOfBrides " + noOfBrides);

            String Bride = tokens[1];

            String removejunkfromb1 = Bride.substring(1, Bride.length() - 1);
            List<String> BrideList = new ArrayList(Arrays.asList(removejunkfromb1.split(",")));


            String[] itemsArray = new String[BrideList.size()];

            String[] Brides = BrideList.toArray(itemsArray);
            System.out.println(Arrays.toString(Brides));


            String Groom = tokens[2];
            String removejunkfromg1 = Groom.substring(1, Groom.length() - 1);
            List<String> GroomList = new ArrayList(Arrays.asList(removejunkfromg1.split(",")));


            String[] groomArray = new String[GroomList.size()];

            String[] Grooms = BrideList.toArray(groomArray);
            System.out.println(Arrays.toString(Grooms));

//            int pairCount = 0;
//            int flag = 0;


//            for (int m = 0 ; m < BrideList.size() ; m++) {

//            System.out.println("Bride is " + BrideList.get(0));


//                System.out.println("BrideDrink " + BrideDrink);


//                for (int l = 0; l < GroomList.size(); l++) {

//            int Counter = noOfBrides;
//
//
//            char BrideDrink = BrideList.get(0).charAt(BrideList.get(0).length() - 1);
//            char GroomDrink = GroomList.get(0).charAt(GroomList.get(0).length() - 1);
//
//            int count = 0;

            if (GroomList.get(0).charAt(GroomList.get(0).length() - 1) != BrideList.get(0).charAt(BrideList.get(0).length() - 1)) {

//                System.out.println("The number of unmatched pair is " + noOfBrides);


//                    System.out.println("flag " + flag);

            } else {

                for (int m = 0; m < BrideList.size(); m++) {

                    System.out.println("Bride is " + BrideList.get(m));

                    char BrideDrink1 = BrideList.get(m).charAt(BrideList.get(m).length() - 1);

                    System.out.println("BrideDrink1 " + BrideDrink1);

                    for (int n = 0; n < GroomList.size(); n++) {

//                        if (n == 4){
//                            count++;
//                            BrideList.remove(BrideList.get(0));
//                            System.out.println("final brides left in the town are " + count);
//
//                        }

                        System.out.println("Groom is " + GroomList.get(n));

                        char GroomDrink1 = GroomList.get(n).charAt(GroomList.get(n).length() - 1);

                        System.out.println("GroomDrink1 " + GroomDrink1);

                        if (BrideDrink1 == GroomDrink1) {

                            GroomList.remove(GroomList.get(n));
//                            BrideList.remove(BrideList.get(n));

                            System.out.println(GroomList.toString());
                            System.out.println(BrideList.toString());

//                            noOfBrides = noOfBrides - 1;
//                            System.out.println("The brides left in the town are " + noOfBrides);
//                            System.out.println("GroomList.size() " + GroomList.size());

                            break;


//                        } else {
//
//                            String temp = GroomList.get(0);
//
//                            System.out.println("temp " + temp);
//                            System.out.println("GroomList.size() " + GroomList.size());
//
//                            //make a loop to run through the array list
//                            for (int j = 1; j < GroomList.size(); j++) {
//                                //                                System.out.println("GroomList.get(i) " + GroomList.get(i));
//                                //set the last element to the value of the 2nd to last element
//                                System.out.println("start");
//                                System.out.println(GroomList);
//                                String temp1 = GroomList.get(j);
//                                System.out.println(temp1);
//                                GroomList.remove(temp1);
//                                GroomList.add(j - 1, temp1);
//                            }
//                            //set the first element to be the last element
//                            //                            GroomList.add(GroomList.size()-1, temp);
//                            System.out.println("Shifted groomlist is " + GroomList.toString());
//
//                            if (BrideList.size() == 1){
//                                BrideList.remove(BrideList.get(0));
//                            }
//
////                            else {
////                                System.out.println("finally the brides left are : " + );
////                            }
//
//                        }
                        }


//
//            }


                    }

                }

                System.out.println("The brides left in the town are " + GroomList.size());

            }

        }
    }}
