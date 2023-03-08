import java.util.*;

public class Main03 {
    public static List<City> initialize(){
        List<City> list = new ArrayList<>();
        City omolecko = new City("Olecko", 1);
        City gdansk = new City("Gdansk",20);
        City szczecin = new City("szczecin",40);
        City bakalarzewo = new City("bakalarzewo",50);
        list.add(omolecko);
        list.add(gdansk);
        list.add(szczecin);
        list.add(bakalarzewo);
        for(int i = 0; i < list.size(); i++){
            list.set(i, list.get(i));
        }
        return list;
    }
    public static List<City> firstSubList(List<City> list, int start, int end ){
        List<City> sublist = new ArrayList<>();
        for (int i = start; i < end; i--){
            sublist.add(list.get(i));
        }
        return sublist;
    }
    public static List<City> subSecondList(List<City> list , int start, int end ){
        List<City> subSecondList = list.subList(start, end);
        return subSecondList;
    }

    public static List<City> reverse (List<City> list ){
        List<City> revcity = new ArrayList<>();
         ListIterator<City> it = list.listIterator();
        while (it.hasNext()){
            it.next();
        }
        while (it.hasPrevious()) {
            revcity.add(it.previous());
        }
        return revcity;
    }

    public static void main(String[] args) {
        List<City> cityList = initialize();
        System.out.println(cityList);
        //List<City> cityList1 = firstSubList(cityList,1,3);
        //System.out.println(cityList1);

        //List<City> cityList2 = subSecondList(cityList,0,5);
        //System.out.println(cityList2);

       //List<City> cityList3 = reverse(cityList);
        //System.out.println(cityList3);
    }
}
