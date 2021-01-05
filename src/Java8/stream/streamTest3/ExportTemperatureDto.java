package Java8.stream.streamTest3;


/**
 * @Author : WuDazhong
 * @Date :2021/1/5 19:16
 * @Description :
 */
public class ExportTemperatureDto {
    private String name;
    private Double morningTemperature;
    private Double afternoonTemperature;
    private String classId;
    private String gradeId;
    private Integer personId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMorningTemperature() {
        return morningTemperature;
    }

    public void setMorningTemperature(Double morningTemperature) {
        this.morningTemperature = morningTemperature;
    }

    public Double getAfternoonTemperature() {
        return afternoonTemperature;
    }

    public void setAfternoonTemperature(Double afternoonTemperature) {
        this.afternoonTemperature = afternoonTemperature;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getGradeId() {
        return gradeId;
    }

    public void setGradeId(String gradeId) {
        this.gradeId = gradeId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public ExportTemperatureDto( Integer personId,String name) {
        this.name = name;
        this.personId = personId;
    }

    @Override
    public String toString() {
        return "ExportTemperatureDto{" +
                "name='" + name + '\'' +
                ", morningTemperature=" + morningTemperature +
                ", afternoonTemperature=" + afternoonTemperature +
                ", classId='" + classId + '\'' +
                ", gradeId='" + gradeId + '\'' +
                ", personId=" + personId +
                '}';
    }
}
