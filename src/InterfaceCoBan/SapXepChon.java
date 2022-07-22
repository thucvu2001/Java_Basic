package InterfaceCoBan;

public class SapXepChon implements SapXepInterface {
    @Override
    public void sapXepTang(double[] arr) {
        int min_idx;
        for (int i = 0; i < arr.length; i++) {
            min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                }
            }
            double tmp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = tmp;
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        int min_idx;
        for (int i = 0; i < arr.length; i++) {
            min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min_idx]) {
                    min_idx = j;
                }
            }
            double tmp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = tmp;
        }
    }
}
