public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isCheckWeight(){
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println("Maçı kazanan: "+ this.f2.name);
            return true;
        }

        if(this.f2.health == 0){
            System.out.println("Maçı kazanan: "+this.f1.name);
            return true;
        }
        return false;
    }

    void printScore(){
        System.out.println("---------------------------");
        System.out.println(this.f1.name + " Kalan can: " + this.f1.health);
        System.out.println(this.f2.name + " Kalan can: " + this.f2.health);
    }

    void run(){
            if (isCheckWeight()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("======== YENİ ROUND ===========");

                    int rand = (int) (Math.random()* 100);

                    if(rand < 50){
                        f2.health = f1.hit(f2);
                        if (isWin()){
                            break;
                        }
                    }
                    else{
                        f1.health = f2.hit(f1);
                        if (isWin()){
                            break;
                        }
                    }
                    printScore();
                }

            } else {
                System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
            }
    }
}
