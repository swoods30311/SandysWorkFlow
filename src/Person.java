public class Person implements Work {
    byte workFlow;
    byte energy;
    byte focus;
    void changeWorkFlow() {
        workFlow = energy + focus;
    }
    void changeEnergy(byte newValue) {
        energy = newValue;
    }
    void regulateFocus(byte newValue) {
        focus = newValue;
    }
    void printStates() {
        System.out.println("workFlow:" +
                workFlow + " Energy:" +
                energy + " Focus:" + focus);
    }
}
}
