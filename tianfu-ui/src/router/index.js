import Vue from 'vue'
import VueRouter from 'vue-router'
import index from '../components/index'
Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'default',
    redirect: '/index',
    component: () => import('../components/home'),
    meta: {
      requireAuth: true
    },
    children: [{
      path: '/index',
      name: 'index',
      component: index,
      meta: {
        requireAuth: true
      }
    },{
      path: '/todo',
      name: 'todo',
      component: () => import('../components/todo'),
      meta: {
        requireAuth: true
      }
    }]
  },
  {
    path: '/login',
    name: 'login',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../components/login')
  },
  {
    path: '/*',
    component: () => import('../components/pages/Error404')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
