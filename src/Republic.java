public class Republic extends Government {

    protected int numberBatches;

    public Republic(){ //пустой конструктор
        this.construction = "Republic";
        this.electionDeadline = random.nextInt(10);
        this.majorName = String.valueOf(major.values()[2]);
        this.governmentName = String.valueOf(title.values()[2]);
        this.numberBatches = random.nextInt(100);
    }

    public Republic(String govermentName, int electionDeadline, int numberBatches){ //передали значения
        this.construction = "Republic";
        this.electionDeadline = electionDeadline;
        this.majorName = String.valueOf(major.values()[2]); //всгда парламент
        this.governmentName = govermentName; //название страны
        this.numberBatches = numberBatches;
    }



    @Override
    public void printInfo() {
        StringBuilder stringBuilder = new StringBuilder("");
        //название страны, кто правитель, сколько осталось править, количество субъектов
        stringBuilder.append("Строй: " + this.construction + '\n');
        stringBuilder.append("Название страны: " + this.governmentName + '\n');
        stringBuilder.append("Главный в стране: " + this.majorName + '\n');
        stringBuilder.append("Срок выборов: " + this.electionDeadline + '\n');
        stringBuilder.append("Количество партий: " + this.numberBatches + '\n');

        System.out.println(stringBuilder);
    }

    @Override
    public void changeMajor() {

    }

    @Override
    public void changeRegime() {

    }
}
