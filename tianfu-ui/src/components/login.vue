<template>
  <div id="poster">
    <q-form
      @submit="onSubmit"
      @reset="user = {}"
      class="q-gutter-md login-container"
    >
      <q-input v-model="user.username" type="text" label="账号" />
      <q-input v-model="user.password" type="password" label="密码" />
      <div>
        <q-btn label="Submit" type="submit" color="primary" />
        <q-btn
          label="Reset"
          type="reset"
          color="primary"
          flat
          class="q-ml-sm"
        />
      </div>
    </q-form>
  </div>
</template>
<script>
export default {
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
    };
  },
  methods: {
    onSubmit() {
      this.$api
        .post("user/login", this.user)
        .then((res) => {
          if (res.data.code == 200) {
            this.$store.commit('login',this.user)
            this.$router.push(this.$route.query.redict);
          } else {
            alert("登录失败");
          }
        })
        .catch(() => {});
    },
  },
};
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

#poster {
  background: url("../assets/cpy.jpg") no-repeat;
  background-position: center;
  height: 100%;
  width: 100%;
  background-size: cover;
  position: fixed;
}
body {
  margin: 0px;
}
</style>