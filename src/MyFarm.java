import java.util.ArrayList;
import java.util.List;

public class MyFarm {

    /***
     * Goal of this project:
     * Practice with 1-dimensional arrays of objects
     */
    Plot[] rowArr;
    ArrayList<Plot> rowList;

    public static void main(String[] args) {
        MyFarm garden = new MyFarm();
    }

    public MyFarm() {

        rowArr = new Plot[10];
        for (int z = 0; z < 10; z++) {
            rowArr[z] = new Plot();
        }

        /***
         * for each method you code, call it here
         * be sure to print each result in a sentence,
         * e.g. for the totalPlants() method, your output should look something like:
         * "There are 730 total plants across all the plots"
         */
        displayPlots();
        printPlantNames();
        totalPlants();
        tomatoLocations();
        totalCarrots();
        averageNumberOfPlants();
        numberOfCarrotPlots();
        numberOfEmptyPlots();
        everyOtherNeedsWater();
        plantWithMaxNumber();
    }

    public void displayPlots() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        for(int i = 0; i< rowArr.length; i++){
            rowArr[i].printPlotInfo();
        }
    }

    public void printPlantNames() {
        // print the name of each plant in the row and its index
        for(int i = 0; i< rowArr.length; i++){
            System.out.println(rowArr[i].plantName);
        }
    }

    public void totalPlants() {
        // how many total plants are there in the row?
        System.out.println(rowArr.length);
    }

    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes

        // Note: this one needs a for loop, NOT a for each loop
        List<Integer> tomatoIndexes = new ArrayList<>();

        for(int i = 0; i< rowArr.length; i++){
            if(rowArr[i].plantName=="tomato"){
                tomatoIndexes.add(i);
            }
        }
        System.out.println(tomatoIndexes);
    }

    public void totalCarrots() {
        // how many total carrot plants are there?
        int totalCarrots = 0;

        for(int i = 0; i< rowArr.length; i++){
            if(rowArr[i].plantName=="carrot"){
                totalCarrots+=1;
            }
        }
        System.out.println(totalCarrots);
    }

    public void averageNumberOfPlants() {
        // what is the average number of plants per plot?
        int NumberPlantsPerPlot=0;
        int averageNumberOfPlants;

        for(int i = 0; i< rowArr.length; i++){
            NumberPlantsPerPlot+= rowArr[i].numberOfPlants;
        }

        averageNumberOfPlants = NumberPlantsPerPlot/ rowArr.length+1;
        System.out.println(averageNumberOfPlants);
    }

    public void numberOfCarrotPlots() {
        // how many plots have carrots on them?
        int numCarrots = 0;
        for(int i = 0; i< rowArr.length; i++) {
            if (rowArr[i].plantName == "carrot") {
                numCarrots++;
            }
        }
        System.out.println(numCarrots);
    }

    public void numberOfEmptyPlots() {
        // how many plots are empty?
        int numEmptyPlots = 0;
        for(int i = 0; i< rowArr.length; i++) {
            if (rowArr[i].plantName == "empty") {
                numEmptyPlots++;
            }
        }
        System.out.println(numEmptyPlots);
    }

    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for even numbered indexes and false for odd numbered indexes
        for(int i = 0; i< rowArr.length; i++) {
            if (i%2==0) {
                rowArr[i].needsWater = true;
            }else{
                rowArr[i].needsWater = false;
            }
        }
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        String plantWithMost = "";
        int marginOfVictory = 0;

        for(int i = 0; i< rowArr.length; i++) {
            if(rowArr[i].plantName!= plantWithMost && marginOfVictory<1) {
                if (rowArr[i].plantName == "carrot") {
                    plantWithMost = rowArr[i].plantName;
                } else if (rowArr[i].plantName == "tulip") {
                    plantWithMost = rowArr[i].plantName;
                } else if (rowArr[i].plantName == "lettuce") {
                    plantWithMost = rowArr[i].plantName;
                } else if (rowArr[i].plantName == "tomato") {
                    plantWithMost = rowArr[i].plantName;
                }
            }else if(rowArr[i].plantName== plantWithMost){
                marginOfVictory+=1;
            }else if (rowArr[i].plantName!= plantWithMost){
                marginOfVictory-=1;
            }
        }
        System.out.println(plantWithMost);
    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?

    }

    public void greaterThan10() {
        // how many plots have more than 10 plants in the plot?

    }

    public void plantWithMaxNumberNeedsWater(){
        // which plant type has the most total plants (not counting empty plots) that needs water?

    }

    /***
     * more challenging
     */
    public void greatestDifferenceNumberBetweenAnyPlants() {
        // of every pair of adjacent plots, which two have the greatest difference in plant numbers?
        // what is that difference?

    }

    public void numberOfCarrotPlotsNextToLettuce() {
        // how many carrot plots share a border with a lettuce plot?

    }

    /***
     * most challenging
     */
    public void greatestDifferenceOfPlantNumbers() {
        // what is the largest difference in plant numbers between two plants of the same type?

    }

}