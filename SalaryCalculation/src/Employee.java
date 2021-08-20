public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    int year;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.year = 2021;
    }

    double tax(){
        double tax = 0.0;
        if(this.salary > 1000){
            tax = this.salary * 0.03;
        }
        return tax;
    }

    double bonus(){
        int hours;
        double fee = 0.0;
        if(workHours > 40){
            hours = this.workHours - 40;
            fee = (double)hours * 30;
        }
        return fee;
    }

    double raiseSalary(){

        int duration = this.year - this.hireYear;
        double fee = 0.0;

        if(duration < 10)
            fee = this.salary * 0.05;
        else if(duration > 9 && duration < 20)
            fee = this.salary * 0.1;
        else if(duration > 19)
            fee =  this.salary * 0.15;

        return fee;
    }

    void tooString()
    {

        /**
         *
         Adı : kemal
         Maaşı : 2000.0
         Çalışma Saati : 45
         Başlangıç Yılı : 1985
         Vergi : 60.0
         Bonus : 150.0
         Maaş Artışı : 300.0
         Vergi ve Bonuslar ile birlikte maaş : 2090.0
         Toplam Maaş : 2300.0
         * */
        System.out.println("Adı: " + this.name + "\n" + "Maaşı: " + this.salary + "\n" + "Çalışma Saati: " + this.workHours + "\n" +
                "Başlangıç Yılı: " + this.hireYear + "\n" + "Vergi: " + tax() + "\n" + "Bonus: " + bonus() + "\n" +
                "Maaş Artışı: " + (bonus() + raiseSalary() - tax()) + "\n" + "Veri ve bonuslar ile birlikte maaş: " + (this.salary - tax() + bonus()) + "\n" +
                "Toplam Maaş: " + (this.salary + raiseSalary() + bonus() - tax()));

    }
}
