import java.time.LocalDate;
import java.util.Objects;

public class JobApplication {

    private final String company;
    private final String position;
    private final String status;
    private final LocalDate appliedAt;

    public JobApplication(String company, String position, String status, LocalDate appliedAt) {
        if (company == null || position == null || status == null || appliedAt == null) {
            throw new IllegalArgumentException("All fields must be non-null");
        }
        this.company = company;
        this.position = position;
        this.status = status;
        this.appliedAt = appliedAt;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getAppliedAt() {
        return appliedAt;
    }

    @Override
    public String toString() {
        return String.format("JobApplication{company='%s', position='%s', status='%s', appliedAt=%s}",
                company, position, status, appliedAt);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobApplication)) return false;
        JobApplication that = (JobApplication) o;
        return company.equals(that.company) &&
               position.equals(that.position) &&
               status.equals(that.status) &&
               appliedAt.equals(that.appliedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, position, status, appliedAt);
    }

    // Optional: main() for testing, but keep it outside class definition or write a separate Test class
    public static void main(String[] args) {
        JobApplication app = new JobApplication("Google", "SWE", "APPLIED", LocalDate.now());
        System.out.println(app);
    }
}
