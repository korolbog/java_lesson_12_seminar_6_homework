package work2;
/**
 * Комментарий к Work2
 * 1. Нарушен принцип Single Responsibility Principle,
 * поскольку ReportGenerator содержит 2 ответственности: XML и JSON.
 * 2. Нарушен принцип Interface segregation principle,
 * поскольку разным клиентам нужны разные интерфейсы.
 * Решение: Разбить интерфейс ReportGenerator на два - JsonReportGenerator и XmlReportGenerator.
 * */
public interface ReportGenerator {
    String generateXml();
    String generateJson();
}
