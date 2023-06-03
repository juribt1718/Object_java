package main;

import java.util.*;

import static java.util.Arrays.asList;
public class HumanMain {


    public static void main(String[] args) {
        String[] hobbies = new String[3];
        hobbies[0] = "Велосипед";
        hobbies[1] = "Плавание";
        hobbies[2] = "Чтение";

        String[] algoHobbies = new String[]{ "Горы","Алкоголь","Музыка"};


        Human yura = new Human("Yura",15,hobbies);
        System.out.println("Величина массива:"+ algoHobbies.length);

        //  Boolean k =    new ArrayList<>(asList(algoHobbies)).contains("Алкоголь");

        System.out.println("Есть ли значение:"+   asList(algoHobbies).contains("Алкоголь"));

        int[][] intArray = new int[][]{
                new int[] {1,2,3},
                new int[] {4,5,6}
        };

        List<String> hobbiesList = new ArrayList<String>();
        hobbiesList.add("Танцы");
        hobbiesList.add("Шахматы");
        hobbiesList.add("Ходьба");

        System.out.println(hobbiesList.get(0).toString());
        System.out.println(hobbiesList.get(1).toString());
        System.out.println(hobbiesList.get(2).toString());

        List<String> hobbiesListAnother = Arrays.asList("Танцы","Бокс","Фехтование");
        Set<String> hobbiesSet = new HashSet<>();
        hobbiesSet.add("Борьба");
        hobbiesSet.add("Танцы");
        hobbiesSet.add("Ходьба");
        //  Set<String> hobbiesSetAnother = HashSet. asList("Танцы","Бокс","Фехтование");

//        Human yura = new Human("Yura", 33,hobbies);
        Human yura1 = new Human("Yura",15,hobbies);
         boolean test1 = yura.equals(yura1);
        System.out.println("Check 2 objects:" + test1);

        Set<Human> humanSet = new HashSet<>();
        humanSet.add(yura);
        humanSet.add(yura1);

        // yura1 = yura;
        boolean test3 = yura.equals(yura1);

        System.out.println("Check 2 objects (final):" + test3);
        System.out.println("Данные по hashCode 1 -го объекта:" +  yura.hashCode());
        System.out.println("Данные по hashCode 2 -го объекта:" +  yura1.hashCode());

        Human yura2 = new Human("Dormidont",45,hobbies);
        Human yura3 = new Human("Evlampiy",35,hobbies);

        Map<String, Human> humansMap = new HashMap<>();
        humansMap.put("123445354",yura2);
        humansMap.put("1234555354",yura3);

        //1-й вид цикла
        for(int i=0;i <hobbies.length; i++){
            System.out.println("Данные значений массива:" + hobbies[i]);
        }

        //2-й вид цикла
        for(String hobby: hobbies){
            System.out.println("Данные значений массива1:" + hobby);
        }

        for(String hobby1: hobbiesList){
            System.out.println("Данные значений листа:" + hobby1);
        }

        for(String hobby2: hobbiesSet){
            System.out.println("Данные значений сета:" + hobby2);
        }

        //3-й вид цикла
        boolean arrayContainJava = false;
        int index = 0;
        while (!arrayContainJava && index< hobbies.length ) {
            if (hobbies[index].equals("Чтение")) {
                arrayContainJava = true;
            }
            System.out.println("Цикл 3: "+hobbies[index]);
            index++;
        }
        // 4-й цикл
        arrayContainJava = false;
         index = 0;
        do {
            if (hobbies[index].equals("Велосипед")) {
                arrayContainJava = true;
            }
            System.out.println("Цикл 4: " + hobbies[index]);
            index++;
        }
        while (!arrayContainJava && index < hobbies.length);

    }
}
