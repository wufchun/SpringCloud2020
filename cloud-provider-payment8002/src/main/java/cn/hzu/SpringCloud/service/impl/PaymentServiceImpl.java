package cn.hzu.SpringCloud.service.impl;
import cn.hzu.SpringCloud.dao.PaymentDao;
import cn.hzu.SpringCloud.entities.Payment;
import cn.hzu.SpringCloud.service.PaymentService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
