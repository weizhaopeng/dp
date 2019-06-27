package adapter;

public class InformationAdapter implements InformationFormat {
    private InformationSubmit info;

    public InformationAdapter(InformationSubmit info) {
        this.info = info;
    }
    void setInformationSubmit(InformationSubmit infoS) {
        this.info = infoS;
    }

    @Override
    public String getInformation() {
        return "用户名：" + info.username +
                "\n年龄：" + info.age +
                "\n家庭地址：" + info.address +
                "\n电话号码：" + info.telephoneNumber;
    }
}
