package cn.hzu.SpringCloud.service;
import cn.hzu.SpringCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
