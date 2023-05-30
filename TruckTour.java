    public static int truckTour(List<List<Integer>> petrolpumps) {
    // Write your code here
    // Write your code here
        int startingFuel = 0;
        int index = 0;
        for (int i = 0 ; i < petrolpumps.size() ; i++){
            List<Integer> currentPetrolPump = petrolpumps.get(i);
            startingFuel += currentPetrolPump.get(0);
            startingFuel -= currentPetrolPump.get(1);
            if (startingFuel < 0){
                index++;
                startingFuel = 0;
                i = index-1;
            }
            
        }
        return index;

    }
