<template>
  <div class="home">
    <q-btn color="secondary" label="点击添加个人信息" @click="loadData"/>
  </div>
</template>

<script>
// @ is an alias to /src
import { api } from '../boot/axios'


export default {
  name: 'Home',
  components: {
  },
  methods: {
    loadData () {
      api.get('user/single')
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
  }
}
</script>
