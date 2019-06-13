package designPatterns;

/**
 * @author chamodshehanka on 6/13/2019
 * @project Demo
 **/
public interface Strategy {
    public int doOperation(int num1, int num2);
}

class AddOperation implements Strategy{

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class SubstractOperation implements Strategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

class Context{
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
