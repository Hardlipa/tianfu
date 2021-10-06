<template>
  <div class="home">
    <q-btn color="secondary" label="点击添加个人信息" @click="loadData"/>
    <q-form v-if="showForm" @submit="addUser" style="max-width: 400px"
    >
      <q-input
          v-model="user.username"
          label="用户名"
          :rules="[ val => val && val.length > 0 || 'Please type something']"
      />
      <q-input
          v-model="user.password"
          label="密码"
      />
      <div>
        <q-btn label="确定" type="submit" color="primary"/>
      </div>
    </q-form>
  </div>
</template>

<script>
// @ is an alias to /src


export default {
  name: 'Home',
  components: {},
  data() {
    return {
      user: {
        username: '',
        password: ''
      },
      showForm: true,
    }
  },
  methods: {
    loadData() {
      this.$api.get('user/single')
          .then((response) => {
            console.log(response)
          })
          .catch(() => {
            console.log("sb")
            // this.$q.notify({
            //   color: 'negative',
            //   position: 'top',
            //   message: 'Loading failed',
            //   icon: 'report_problem'
            // })
          })
    },
    addUser() {
      this.$api.post('user/enroll', this.user)
          .then(()=>{
            console.log("注册成功")
          }).catch(() =>{
        console.log("注册失败")
      })
    }
  }
}
</script>
