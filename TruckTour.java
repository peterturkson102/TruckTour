    public static int truckTour(List<List<Integer>> petrolpumps) {
    // Write your code here
    // Write your code here
        int startingFuel = 0;
        int index = 0;
        for (int i = 0 ; i < petrolpumps.size() ; i++){
            List<Integer> currentPetrolPump = petrolpumps.get(i);
            //gets the fuel for the current filling station added to our fuel collection
            startingFuel += currentPetrolPump.get(0);
            
            //deducts the distance this new petrolpump is from our fuel collection
            startingFuel -= currentPetrolPump.get(1);
            
            //checksif the fuel is finished hence wrong starting index
            if (startingFuel < 0){
                //sets the index to the next one as starting index so we can start the check all ove from the new index
                index++;
               // sets fuel to zero since we are starting afresh from a new index
                startingFuel = 0;
                // this is to set the increment i to the new index by setting it as a the prev value of the index we are going to start with bcos the next loop will increase it to our actual new start index
                i = index-1;
            }
            
        }
        return index;

    }
