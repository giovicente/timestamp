package giovicente.com.timestamp.services;

import giovicente.com.timestamp.models.MainframeTimestamp;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;

@Service
public class TimestampService {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd-HH.mm.ss.SSS");
    private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("000");

    public MainframeTimestamp gerarTimestamp() {

        long dataHoraTransacaoAuxiliar = (System.currentTimeMillis() * 1000);

        MainframeTimestamp mainframeTimestamp
                = new MainframeTimestamp(SIMPLE_DATE_FORMAT.format(dataHoraTransacaoAuxiliar / 1000)
                + DECIMAL_FORMAT.format(System.nanoTime() % 1000));

        return mainframeTimestamp;
    }

}
