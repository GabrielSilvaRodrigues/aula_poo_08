import java.util.Date;

public class Sobrecarga {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Aluno gabriel=new Aluno("Gabriel","292", new Date(2005,07,13));
        Aluno a2 = new Aluno(new Date(2005,07,13), "292");
        Aluno a1 = new Aluno();
        Aluno a3 = new Aluno("Kaue", new Date(2005,07,13));
        Aluno a4 = new Aluno("Guilherme", "292");
        System.out.println("Nome:" + a1.getNome());
        System.out.println("Nome:" + a2.getNome());
        System.out.println("Nome:" + a3.getNome());
        System.out.println("Nome:" + a4.getNome());
        System.out.println("Nome:" + gabriel.getNome());
    }
}
