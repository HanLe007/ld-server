package net.le.baseframe.core.user;

import net.le.baseframe.core.entity.User;
import net.le.baseframe.core.service.UserService;
import net.le.baseframe.util.UserNumberUtil;
import net.le.baseframe.web.PageBean;
import net.le.baseframe.web.PageQuest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

    @Autowired
    private UserService userService;


    @Test
    public void testGetAllUser() {
        PageQuest pageQuest = new PageQuest();
        pageQuest.setPageNum(1);
        pageQuest.setPageSize(10);
        pageQuest.setCondition("1=1");
        PageBean pageBean = userService.getUsers(pageQuest);
        System.out.println("pageBean ==> " + pageBean);
        Assert.assertTrue(pageBean.getList().size() == 0);
    }


    @Test
    public void testAddUser () {
        User user = new User();
        user.setUserNumber(UserNumberUtil.getNumber() + "");
        user.setUserName("韩小乐");
        user.setUserMobile("18149197030");
        user.setUserGender(0);
        user.setUserAddress("咸阳");
        user.setUserMarriage(1);
        user.setMobileDate(5);
        user.setChildrenNum(3);
        user.setSupportNum(3);
        user.setUserEducation(3);
        user.setIsNowCity(1);
        user.setUserHouseRegister("陕西咸阳");
        user.setLiveType("其他");
        user.setLiveStartDate(new Date().getTime() / 1000);
        user.setUserIdCard("610425199705131718");
        user.setUserIdCardUrl("d:/idcardurl/1718.jpg");
        user.setUserImgUrl("d:/imgurl/1718.jpg");
        user.setLinkmanName1("韩乐1");
        user.setLinkmanMobile1("18149197031");
        user.setLinkmanName2("韩乐2");
        user.setLinkmanMobile2("18149197032");
        user.setLinkmanName3("韩乐3");
        user.setLinkmanMobile3("18149197033");
        user.setUserStatus(0);
        user.setCreateUser("韩乐");
        user.setEditUser("韩乐");
        user.setMonthWages(3000);
        user.setCompanyProperties("私营企业");
        user.setUserProfession("特种兵");
        user.setUserCompany("西安华为");
        user.setUserCompanyAdr("科技路");
        user.setIsPrivateCompany(0);
        user.setUserPositionLevel(4);
        user.setIsServant(1);
        user.setUserDepartment("开发部");
        user.setJoinCompanyDate(new Date().getTime() / 1000);
        user.setCompanyMobile("029-00000000");
        user.setPutWagesType("银行转账");
        user.setCompanyCreateDate(new Date().getTime() / 1000);
        user.setCompanySocial("华为");
        user.setCompanySocialDate(new Date().getTime() / 1000);
        user.setCompanySocialBase("3");
        user.setUserPdf("华为");
        user.setPdfCreateDate(new Date().getTime() / 1000);
        user.setPdfBase("5");
        user.setHouseType("商品房");
        user.setHouseBuyDate(new Date().getTime() / 1000);
        user.setHouseMoney(60000000);
        user.setHouseAcreage(120);
        user.setHouseAddress("西安");
        user.setHouseIsAddress(1);
        user.setHouseLoanYear(20);
        user.setHouseRepaymentMoney(2800);
        user.setHasHouseRepayment(0);
        user.setCarBuyType("贷款");
        user.setCarBuyDate(new Date().getTime() / 1000);
        user.setCarMoney(1200);
        user.setCarCourse(20000);
        user.setCarRepaymentMoney(180000);
        user.setCarBrand("别克");
        user.setCarInputDate(new Date().getTime() / 1000);
        user.setCarColor("红");
        user.setCarModel("suv");
        user.setCarSafe("交强险");
        user.setCarHasFault(1);
        user.setLinkmanNexus1("配偶");
        user.setLinkmanNexus2("朋友");
        user.setLinkmanNexus3("朋友");
        System.out.println(user);

//        User u = userService.addUser(user);
//        System.out.println(u);
//        Assert.assertTrue(u.getId() != null);
    }

    @Test
    public void testUpdateUser () {
        PageQuest pageQuest = new PageQuest();
        pageQuest.setPageNum(1);
        pageQuest.setPageSize(10);
        PageBean pageBean = userService.getUsers(pageQuest);
        List<User> list = (List<User>)pageBean.getList();
        User user = list.get(0);
        user.setUserName("韩乐乐1");
        user.setCarSafe("缴费通鲜叶");
        user.setCarHasFault(1);
        user.setHouseLoanYear(10);
//        int count = userService.renovateUser(user);
//        Assert.assertTrue(count == 1);
    }

    @Test
    public void testDeleteUser () {
        int count = userService.removeUser(Long.parseLong("20181009230202238"));
        Assert.assertTrue(count == 1);
    }

    @Test
    public void testGetUser () {
        User user = userService.getUser("20181009233548157");
        System.out.println("user ======> " + user);
        Assert.assertTrue(user != null);
    }
}
