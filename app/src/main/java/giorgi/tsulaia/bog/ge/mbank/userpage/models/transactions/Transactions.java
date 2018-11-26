package giorgi.tsulaia.bog.ge.mbank.userpage.models.transactions;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Transactions {
    @SerializedName("MyOperations")
    private List<MyOperations> myOperations;

    @SerializedName("IncomeSum")
    private Double incomeSum;

    @SerializedName("OutcomeSum")
    private Double outcomeSum;

    public List<MyOperations> getMyOperations() {
        return myOperations;
    }

    public void setMyOperations(List<MyOperations> myOperations) {
        this.myOperations = myOperations;
    }

    public Double getIncomeSum() {
        return incomeSum;
    }

    public void setIncomeSum(Double incomeSum) {
        this.incomeSum = incomeSum;
    }

    public Double getOutcomeSum() {
        return outcomeSum;
    }

    public void setOutcomeSum(Double outcomeSum) {
        this.outcomeSum = outcomeSum;
    }
}
