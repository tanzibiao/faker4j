import com.tzb.faker4j.Faker;
import com.tzb.faker4j.params.BankInfo;
import com.tzb.faker4j.params.RefInt;
import com.tzb.faker4j.random.Word;

/**
 * <b>类说明：</b>
 * <p>
 * <b>详细描述：</b>
 *
 * @Author tanzibiao
 * @Date 2021-03-26 15:04:31
 **/
public class Test {
    public static void main(String[] args) {
        //序列号
        RefInt index = new RefInt(0);
        System.out.println(Faker.seqOrderly().seqNo(index,4));
        System.out.println(Faker.seqOrderly().seqNo(index,4));
        System.out.println(Faker.seqOrderly().seqNo(index,4));
        //带前缀序列号
        RefInt preIndex = new RefInt(0);
        String prefix = "OD20210101";
        System.out.println(Faker.seqOrderly().seqNo(prefix,preIndex,4));
        System.out.println(Faker.seqOrderly().seqNo(prefix,preIndex,4));
        System.out.println(Faker.seqOrderly().seqNo(prefix,preIndex,4));
        //带前缀/后缀序列号
        RefInt sufIndex = new RefInt(0);
        String prefix1 = "FC20210101";
        String suffix = ".jpg";
        System.out.println(Faker.seqOrderly().seqNo(prefix1,sufIndex,4,suffix));
        System.out.println(Faker.seqOrderly().seqNo(prefix1,sufIndex,4,suffix));
        System.out.println(Faker.seqOrderly().seqNo(prefix1,sufIndex,4,suffix));

        //随机字母
        System.out.println(Word.randomCapitalWord());
        BankInfo bankInfo = Faker.bank().bankInfo();
        bankInfo.getBankNo();
        bankInfo.getBankCode();
        bankInfo.getBankName();
        System.out.println(Faker.bank().bankInfo().getBankNo());
        System.out.println(Faker.word().randomWord());

    }
}
