package xiaoxu.service.impl;

import com.xiaoxu.bean.Payment;
import org.springframework.stereotype.Service;
import xiaoxu.dao.IPaymentDao;
import xiaoxu.service.IPaymentService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaymentService implements IPaymentService {

    @Resource
    private IPaymentDao paymentDao;

    @Override
    public List<Payment> selectAll() {
        return paymentDao.selectAll();
    }
}
