import Vue from 'vue'
import App from './views/googole.vue'
import router from './router'
import './quasar'
import axios from 'axios'

Vue.config.productionTip = false

Vue.prototype.$axios = axios
// ^ ^ ^ 这将允许你使用$.axios,不需要在每个vue文件中导入axios
const api = axios.create({ baseURL: 'http://127.0.0.1:8090/' })
Vue.prototype.$api = api
// ^ ^ ^ 这将允许您使用this.$api,这样您就可以轻松地根据应用程序的api执行请求

new Vue({
  router,
  render: h => h(App)
}).$mount('#app')
