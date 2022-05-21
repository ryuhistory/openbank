package kr.co.kcd.openbank.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "user_account_number")
@RequiredArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "bankTranId", nullable = false, length = 20)
    private String bankTranId;

    @Column(name = "savingsBankName", nullable = false, length = 20)
    private String savingsBankName;

    @Column(name = "userSeqNo", length = 10)
    private String userSeqNo;

    @Column(name = "AccountNum", length = 16)
    private String AccountNum;

    @Column(name = "accountSeq", length = 3)
    private String accountSeq;

    @Column(name = "accountType", length = 1)
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    @Column(name = "fintechUserNum", length = 24)
    private String fintechUserNum;

    @Column(name = "accountNumMasked", length = 20)
    private String accountNumMasked;

    @Column(name = "payerNum", length = 30)
    private String payerNum;

    @Column(name = "inquiryAgreeYn", length = 1)
    private String inquiryAgreeYn;

    @Column(name = "transferAgreeYn", length = 1)
    private String transferAgreeYn;

    @Column(name = "userEmail", length = 100)
    private String userEmail;



}
