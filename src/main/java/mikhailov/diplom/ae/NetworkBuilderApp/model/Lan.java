package mikhailov.diplom.ae.NetworkBuilderApp.model;

import java.util.List;

public class Lan {

    private String type;
    private String id;
    private String count;
    private String name;
    private List<StaticLan> staticAdresses;
    private List<String> connectedDevice;

    public Lan(String type, String id, String count, String name,
            List<StaticLan> staticAdresses, List<String> connectedDevice) {
        this.type = type;
        this.id = id;
        this.count = count;
        this.name = name;
        this.staticAdresses = staticAdresses;
        this.connectedDevice = connectedDevice;
    }

    public class StaticLan {

        private String name;
        private String ip;

        public StaticLan(String name, String ip) {
            this.name = name;
            this.ip = ip;
        }
    }
}
