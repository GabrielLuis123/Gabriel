import java.util.Timer;

public class Dieta {
    public String Refeicao;
    public Timer Data_Refeicao;

    public Dieta(String refeicao, Timer data_Refeicao) {
        Refeicao = refeicao;
        Data_Refeicao = data_Refeicao;
    }

    public String getRefeicao() {
        return Refeicao;
    }

    public void setRefeicao(String refeicao) {
        Refeicao = refeicao;
    }

    public Timer getData_Refeicao() {
        return Data_Refeicao;
    }

    public void setData_Refeicao(Timer data_Refeicao) {
        Data_Refeicao = data_Refeicao;
    }
}
