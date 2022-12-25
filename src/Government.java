import java.util.Random;

public abstract class Government {
    //главный класс свойств для всех регионов
    //В этом классе реализовать методы для добавления, удаления, поиска и вывода списка объектов-членов группы
    private static int count = 0;
    protected int id; //номер каждой записи
    protected  String construction;
    protected String governmentName; //название страны
    protected  String majorName; //президент, парламент, королева..
    protected int electionDeadline; //срок выборов главного в регионе
    protected Random random = new Random(); //для генераци значений
    protected enum major {president, queen, parliament};
    protected  enum title {Russia, GreatBritain, Czech};

    public Government(){
        this.id = count;
        count++;
    }

    public abstract void printInfo();
    public  abstract void changeMajor(); //переизбрать главного
    public abstract void changeRegime(); //сменить режим в стране, что-то вроде революции


}
