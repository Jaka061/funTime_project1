package kg.itc.examplemvvm.ui.funTime.users.login

import dagger.hilt.android.lifecycle.HiltViewModel
import kg.itc.examplemvvm.domain.use_cases.GetCompanyUseCase
import kg.itc.examplemvvm.ui.base.BaseVM
import javax.inject.Inject

@HiltViewModel
class AuthorizationVM @Inject constructor
    (private val getCompanyUseCase: GetCompanyUseCase) : BaseVM(){
}