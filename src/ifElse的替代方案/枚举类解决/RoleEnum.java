package ifElse���������.ö������;


public enum RoleEnum implements RoleOperation {
     //ϵͳ����Ա(�в���A��Ȩ��)
    ROLE_ROOT_ADMIN{
        @Override
        public String op() {
            return "ROLE_ROOT_ADMIN"+"has AAA permission";
        }
    },

    //��������Ա(�в���B��Ȩ��)
    ROLE_ORDER_ADMIN{
        @Override
        public String op() {
            return "ROLE_ORDER_ADMIN"+"has BBB permission";
        }
    },

    //��ͨ�û�(�в���C��Ȩ��)
    ROLE_NORMAL{
        @Override
        public String op() {
            return "ROLE_NORMAL"+"has CCC permission";
        }
    }
}
