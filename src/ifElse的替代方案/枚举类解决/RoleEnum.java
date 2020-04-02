package ifElse的替代方案.枚举类解决;


public enum RoleEnum implements RoleOperation {
     //系统管理员(有操作A的权限)
    ROLE_ROOT_ADMIN{
        @Override
        public String op() {
            return "ROLE_ROOT_ADMIN"+"has AAA permission";
        }
    },

    //订单管理员(有操作B的权限)
    ROLE_ORDER_ADMIN{
        @Override
        public String op() {
            return "ROLE_ORDER_ADMIN"+"has BBB permission";
        }
    },

    //普通用户(有操作C的权限)
    ROLE_NORMAL{
        @Override
        public String op() {
            return "ROLE_NORMAL"+"has CCC permission";
        }
    }
}
