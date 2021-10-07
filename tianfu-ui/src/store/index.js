import Vuex from 'vuex'
import Vue from 'vue'
Vue.use(Vuex)

export default new Vuex.Store({
    state: {
        user: {
            username: window.sessionStorage.getItem('user' || '[]') == null ? '' : JSON.parse(window.sessionStorage.getItem('user' || '[]'))
        }
    },
    mutations: {
        login(state, user) {
            state.user = user
            window.sessionStorage.setItem('user', JSON.stringify(user))
        }
    },
    actions: {

    }
})