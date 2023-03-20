/**
 * @Description CustomerList为Customer对象的管理模块
 * 内部用数组管理一组Customer对象
 * 并提供相应的添加、修改、删除、和遍历方法
 * 供CustomerView调用
 */
public class CustomerList {
    private Customer[] customers;//用来保存客户对象的数组
    private int total = 0;//记录保存客户对象的数量

    /**
     * @Description 构造器，用来初始化customers数组
     * @param totalCustomer 指定customers数组的最大空间
     */
    public CustomerList(int totalCustomer)
    {
        customers = new Customer[totalCustomer];
    }

    /**
     * @Description 将指定的客户添加到数组中
     * @param customer
     * @return true:添加成功，false：添加失败
     */
    public boolean addCustomer(Customer customer)
    {
        if(total >= customers.length)
        {
            return false;
        }
        else
        {
            customers[total] = customer;
            total++;
            return true;
        }
    }

    /**
     * @Decription 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return true:修改成功，false：修改失败
     */
    public boolean replaceCustomer(int index,Customer cust)
    {
        if(index < 0 || index >= total)
        {
            return false;
        }
        else{
            customers[index] = cust;
            return true;
        }
    }

    /**
     * @Description 删除指定索引位置上的客户
     * @param index
     * @return true:删除成功，false：删除失败
     */
    public boolean deleteCustomer(int index)
    {
        if(index < 0 || index >= total)
        {
            return false;
        }
        else
        {
            for(int i = index;i < total - 1;i++)
            {
                customers[i] = customers[i+1];
            }
        }
        //最后有数据的元素需要置空
        customers[total - 1] = null;
        total--;
        return true;
    }

    /**
     * 获取所有的客户信息
     * @return
     */
    public Customer[] getAllCustomers()
    {
        Customer[] custs = new Customer[total];
        for(int i = 0;i < total;i++)
        {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取指定位置上的客户
     * @param index
     * @return
     */
    public Customer getCustomer(int index)
    {
        if(index < 0 || index >= total)
        {
            return null;
        }
        else {
            return customers[index];
        }
    }
    public int getTotal()
        {
            return total;
        }
}
