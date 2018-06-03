package mikhailov.diplom.ae.NetworkBuilderApp.model;

import java.util.List;

public class Switch {

    private String type;
    private String id;
    private String name;
    private String stp;
    private List<VlanGroup> vlan_group;
    private List<String> connectedDevice;

    public Switch(String type, String id, String name, String stp,
            List<VlanGroup> vlan_group, List<String> connectedDevice) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.stp = stp;
        this.vlan_group = vlan_group;
        this.connectedDevice = connectedDevice;
    }

    public class VlanGroup {
        private String type;
        private String port;

        public VlanGroup(String type, String port) {
            this.type = type;
            this.port = port;
        }
    }
}
