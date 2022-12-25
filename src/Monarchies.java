public class Monarchies extends Government {
    protected int timePower; //время у власти


    public Monarchies(){
        this.construction = "Monarchies";
        this.electionDeadline = random.nextInt(10);
        this.majorName = String.valueOf(major.values()[1]);
        this.governmentName = String.valueOf(title.values()[1]);
        this.timePower = random.nextInt(100);
    }

    public Monarchies(String govermentName, int electionDeadline, int timePower){
        this.construction = "Monarchies";
        this.electionDeadline = electionDeadline;
        this.majorName = String.valueOf(major.values()[1]);
        this.governmentName = govermentName;
        this.timePower = timePower;
    }


    @Override
    public void printInfo() {
        StringBuilder stringBuilder = new StringBuilder("");
        //название страны, кто правитель, сколько осталось править, количество субъектов
        stringBuilder.append("Строй: " + this.construction + '\n');
        stringBuilder.append("Название страны: " + this.governmentName + '\n');
        stringBuilder.append("Главный в стране: " + this.majorName + '\n');
        stringBuilder.append("Срок выборов: " + this.electionDeadline + '\n');
        stringBuilder.append("Время у власти: " + this.timePower + '\n');

        System.out.println(stringBuilder);
    }

    @Override
    public void changeMajor() {

    }

    @Override
    public void changeRegime() {

    }
}
