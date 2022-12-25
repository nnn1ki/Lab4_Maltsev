public class Federation extends Government {
    protected int numberSubjects; //количество субъектов федерации

    public Federation(){
        this.construction = "Federation";
        this.electionDeadline = random.nextInt(10);
        this.majorName = String.valueOf(major.values()[0]);
        this.governmentName = String.valueOf(title.values()[0]);
        this.numberSubjects = random.nextInt(100);
    }

    public Federation(String govermentName, int electionDeadline, int numberSubjects){
        this.construction = "Federation";
        this.electionDeadline = electionDeadline;
        this.majorName = String.valueOf(major.values()[0]);
        this.governmentName = govermentName;
        this.numberSubjects = numberSubjects;
    }


    @Override
    public void printInfo() {
        StringBuilder stringBuilder = new StringBuilder("");
        //название страны, кто правитель, сколько осталось править, количество субъектов
        stringBuilder.append("Строй: " + this.construction + '\n');
        stringBuilder.append("Название страны: " + this.governmentName + '\n');
        stringBuilder.append("Главный в стране: " + this.majorName + '\n');
        stringBuilder.append("Срок выборов: " + this.electionDeadline + '\n');
        stringBuilder.append("Количество субъектов федерации: " + this.numberSubjects + '\n');

        System.out.println(stringBuilder);
    }

    @Override
    public void changeMajor() {

    }

    @Override
    public void changeRegime() {

    }
}
