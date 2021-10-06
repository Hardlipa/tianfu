<template>
    <div>
        <q-form
            @submit="onSubmit"
            @reset="onReset"
            class="q-gutter-md"
        >
            <q-input v-model="user.username" type="text" label="用户名" />
            <q-input v-model="user.password" type="text" label="密码" />
            <div>
                <q-btn label="登录" type="submit" color="primary"/>
                <q-btn label="重置" type="reset" color="primary" flat class="q-ml-sm" />
            </div>
            <router-link to="./signUp">注册</router-link>
        </q-form>
    </div>
</template>
<script>
export default {
    data(){
        return{
            user:{
                username: '',
                password: ''
            }
        }
    },
    methods:{
        submit(){
            this.$api.post('user/login', this.user)
          .then(()=>{
              console.log("登录成功")
          }).catch(() =>{
        console.log("登录失败")
      })
        }
    }
}
</script>
<style scoped>
  .login-container {
    border-radius: 15px;
    background-clip: padding-box;
    margin: 90px auto;
    width: 350px;
    padding: 35px 35px 15px 35px;
    background: #fff;
    border: 1px solid #eaeaea;
    box-shadow: 0 0 25px #cac6c6;
  }
  
  .login_title {
    margin: 0px auto 40px auto;
    text-align: center;
    color: #505458;
  }
</style>